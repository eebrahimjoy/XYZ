package com.example.xyz.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xyz.R;
import com.example.xyz.databinding.ModelPendingServiceItemBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;
import java.util.Locale;

public class ComplimentAdapter extends RecyclerView.Adapter<ComplimentAdapter.ViewHolder> implements OnPageChangeListener, OnLoadCompleteListener {

    private List<String> complimentIssues;
    private List<String> stringListBengali;
    private Context context;
    Activity activity;
    List<Drawable> drawables;
    private Dialog dialog;
    private ImageView backBtn;
    private WebView webViewId;

    public static final String SAMPLE_FILE = "java.pdf";
    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;

    TextToSpeech textToSpeech;


    public ComplimentAdapter(List<String> complimentIssues, Context context, Activity activity, List<Drawable> drawables, List<String> stringListBengali) {
        this.complimentIssues = complimentIssues;
        this.stringListBengali = stringListBengali;
        this.context = context;
        this.activity = activity;
        this.drawables = drawables;

        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });
    }

    @NonNull
    @Override
    public ComplimentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ModelPendingServiceItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.model_pending_service_item, viewGroup, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ComplimentAdapter.ViewHolder viewHolder, final int position) {

        final String string = complimentIssues.get(position);
        final String stringBengali = stringListBengali.get(position);
        final Drawable drawable = drawables.get(position);

        viewHolder.binding.nameTV.setText(string);
        viewHolder.binding.imageIV.setImageDrawable(drawable);

        viewHolder.binding.youtubeTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=rxoS55PAQBI&list=PLVCEN663EzMF1GOPyKInFCyyrO2XmLPRQ&index=2"));
                context.startActivity(intent);
            }
        });

        viewHolder.binding.docTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initSelectedTestDialog();

                displayFromAsset(SAMPLE_FILE);


                //webViewId.loadData(StaticKeys.DOCUMENT, "text/html", "UTF-8");
                backBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        viewHolder.binding.nameTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setCanceledOnTouchOutside(true);
                dialog.setCancelable(true);
                dialog.setContentView(R.layout.dialog_exit_confirmation);

                Window window = dialog.getWindow();
                window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                TextView yesTV = dialog.findViewById(R.id.yesTVID);
                TextView noTV = dialog.findViewById(R.id.noTVID);
                noTV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                yesTV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.desco.org.bd/ebill/login.php"));
                        context.startActivity(intent);

                    }
                });

                dialog.show();

            }
        });

        viewHolder.binding.voiceTextIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(stringBengali, TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }

    @Override
    public int getItemCount() {
        return complimentIssues.size();
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ModelPendingServiceItemBinding binding;

        public ViewHolder(ModelPendingServiceItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    private void initSelectedTestDialog() {
        dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_show_dak_desciptio_text);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        backBtn = dialog.findViewById(R.id.backBtn);
        pdfView = dialog.findViewById(R.id.pdfViewer);

    }

    private void displayFromAsset(String assetFileName) {
        pdfFileName = assetFileName;

        pdfView.fromAsset(SAMPLE_FILE)
                .enableSwipe(true)
                .enableDoubletap(true)
                .pageSnap(true)
                .autoSpacing(true)
                .pageFling(true)
                .swipeHorizontal(true)
                .pageFitPolicy(FitPolicy.WIDTH)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(context))
                .load();

    }


    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        activity.setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));


    }

    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");
    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }


}

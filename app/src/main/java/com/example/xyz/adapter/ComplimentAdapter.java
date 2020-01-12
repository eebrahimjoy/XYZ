package com.example.xyz.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.example.xyz.otherClasses.StaticKeys;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class ComplimentAdapter extends RecyclerView.Adapter<ComplimentAdapter.ViewHolder> implements OnPageChangeListener, OnLoadCompleteListener {

    private List<String> complimentIssues;
    private Context context;
    private Dialog dialog;
    private ImageView backBtn;
    private WebView webViewId;

    public static final String SAMPLE_FILE = "java.pdf";
    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;


    public ComplimentAdapter(List<String> complimentIssues, Context context) {
        this.complimentIssues = complimentIssues;
        this.context = context;
        initSelectedTestDialog();
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

        viewHolder.binding.nameTV.setText(string);

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

    private void displayFromAsset(String assetFileName)
    {
        pdfFileName = assetFileName;

        pdfView.fromAsset(SAMPLE_FILE)
                .pages(0)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .enableDoubletap(true)
                .onPageChange(this)
                .swipeHorizontal(true)
                .pageFitPolicy(FitPolicy.WIDTH)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(context))
                .load();

    }



    @Override
    public void onPageChanged(int page, int pageCount)
    {
        pageNumber = page;

    }

    @Override
    public void loadComplete(int nbPages)
    {
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

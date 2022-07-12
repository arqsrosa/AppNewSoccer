package rosa.silvia.appnewsport.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import rosa.silvia.appnewsport.databinding.NewsItensBinding;
import rosa.silvia.appnewsport.domain.News;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<News> news;

    public NewsAdapter(List<News> news){
        this.news = news;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        NewsItensBinding binding = NewsItensBinding.inflate(layoutInflater, parent,false);
        return new ViewHolder(binding);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news = this.news.get(position);
        holder.binding.tvTitle.setTextAlignment(news.getTitle());
        holder.binding.tvDescription.setText(news.getTitle());
        holder.binding.tvParagrafo.setText(news.getTitle());
        holder.binding.tvDescription.setText(news.getTitle());
    }

    @Override
    public int getItemCount() {
        return this.news.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final NewsItensBinding binding;

        public ViewHolder(NewsItensBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

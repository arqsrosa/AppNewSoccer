package rosa.silvia.appnewsport.ui.News;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import rosa.silvia.appnewsport.databinding.FragmentNewsBinding;
import rosa.silvia.appnewsport.databinding.FragmentNewsBinding;
import rosa.silvia.appnewsport.ui.adapter.NewsAdapter;

public class NewsFragment extends Fragment {

    private FragmentNewsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NewsViewModel newsViewModel =
                new ViewModelProvider(this).get(NewsViewModel.class);

        binding.rvNews.setLayoutManager(new LinearLayoutManager(getContext()));
        binding = FragmentNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        newsViewModel.getNews().observe(getViewLifecycleOwner(), news ->{
            binding.rvNews.setAdapter(new NewsAdapter(news));
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
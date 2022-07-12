package rosa.silvia.appnewsport.ui.News;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import rosa.silvia.appnewsport.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> News;

    public NewsViewModel() {
        this.News = new MutableLiveData<>();

        //TODO de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News( "Primeira Base a chegar a Ilha da Queimada Grande", "Primeira equipe a navegar da Praia Grande até a QG"),
        news.add(new News( "Treino para Expedição volta a Baixada Santista ", "Treino para percorrer os 60kms que envolve a cidades de Praia Grande, São Vicente e Santos"),
        news.add(new News( "Ventos fortes faz equipe dar Huli", "Essa mudança de tempo está fazendo a equipe treinar as diversidades que pode acontecer em alto mar"),

                this.News.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.News;
    }
}
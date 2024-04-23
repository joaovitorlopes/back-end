package joaovitorlopes.com.github.calculations;

public class RecommendationFilter {

    public void filter(Sortable sortable){
        if (sortable.getRating() >= 4) {
            System.out.println("It's Among the current favorites");
        } else if (sortable.getRating() >= 2) {
            System.out.println("Very highly rated at the moment!");
        } else {
            System.out.println("Add it to your favorites to watch later!");
        }
    }
}

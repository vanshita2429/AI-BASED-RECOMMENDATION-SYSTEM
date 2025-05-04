import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;

public class RecommenderApp {
    public static void main(String[] args) {
        try {
            DataModel model = new FileDataModel(new File("preferences.csv"));
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
            UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            int userId = 1;
            List<RecommendedItem> recommendations = recommender.recommend(userId, 2);

            System.out.println("Recommendations for user " + userId + ":");
            if (recommendations.isEmpty()) {
                System.out.println("No recommendations found.");
            } else {
                for (RecommendedItem recommendation : recommendations) {
                    System.out.println("Item ID: " + recommendation.getItemID() +
                                       ", Estimated Preference: " + recommendation.getValue());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

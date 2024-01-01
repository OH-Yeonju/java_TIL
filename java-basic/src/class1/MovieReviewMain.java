package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];
        
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간영화";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("제목 : " + review.title + " 리뷰 : " + review.review);
        }

    }
}

package Contenidos;

public class entretenimientos extends Section {
    public entretenimientos(String name) {
        super(name);
    }

    public void addReview(String title, String author, String content, int rating) {
        Review review = new Review(title, author, content, rating);
        getArticles().add(review);
    }

    private static class Review extends Article {
        private int rating;

        public Review(String title, String author, String content, int rating) {
            super(title, author, content);
            this.rating = rating;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public String getContent() {
            return super.getContent() + "\n\n" + "Calificación: " + rating;
        }
    }
}




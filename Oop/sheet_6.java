//public class sheet_6 {
//    public static void main(String[] args) {
//
//        Movie m1 = new Movie("KGF","rajhans","two");
//        Movie m2 = new Movie("URI","fmds","three");
//        Movie m3 = new Movie("BHOLA","cinepolis","one");
//        Movie m4 = new Movie("FOZI","inox");
//        Movie m5 = new Movie("THE","tgb");
//
//        Movie[] movies = new Movie[5];
//        movies[0]=m1;
//        movies[1]=m2;
//        movies[2]=m3;
//        movies[3]=m4;
//        movies[4]=m5;
//
//        Movie[] ans =Movie.get5StarMovies(movies);
//
////        System.out.println("film Name"+"       "+"Studio Name"+"         "+"film Rating");
////        for (Movie m : ans){
////            if (m != null){
////                System.out.println(m.getTitle()+"   "+m.getStudio()+"   "+m.getRating());
////            }
////        }
//        for (int i=0;i< ans.length;i++){
////            Movie m = ans[i];
//            if(ans[i]!=null){
//                System.out.println(ans[i].getTitle()+"   "+ans[i].getStudio()+"   "+ans[i].getRating());
//            }
//        }
//
//
//    }
//}
//
//class Movie{
//    private String title ;
//    private String studio;
//    private String rating;
//
//    public Movie(String title, String studio, String rating) {
//        this.title = title;
//        this.studio = studio;
//        this.rating = rating;
//    }
//    public Movie(String title,String studio){
//        this.title=title;
//        this.studio=studio;
//        this.rating="5star";
//    }
//
//    public static Movie[] get5StarMovies(Movie[] movies){
//        Movie ans[] = new Movie[movies.length];
//
//        for (int i=0;i< movies.length;i++)
//        {
//            if (movies[i].rating.equals("5star")){
//                ans[i]=movies[i];
//            }
//        }
////        int i=0;
////        for (Movie m: movies){
////            if (m.rating.equals("5 star")){
////                ans[i]=m;
////                i++;
////            }
////        }
//        return ans;
//
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getStudio() {
//        return studio;
//    }
//
//    public String getRating() {
//        return rating;
//    }
//}

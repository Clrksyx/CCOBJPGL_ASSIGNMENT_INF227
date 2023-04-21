public class App {

    static boolean iWillReviewNa  = true;
    static boolean iWillNotFailNa = true;

    public static void main(String[] args) throws Exception {
        
    App myReview = new App();

    //precondition
    assert iWillReviewNa == true: "nanood kasi ako ng anime magdamag";
   
    myReview.exam();

    //postcondition
    assert iWillNotFailNa == true: "hindi ako nakapag review dahil nanood lang ako ng anime magdamag";

    }
    void exam(){
        iWillNotFailNa = false;
        
 }
} 

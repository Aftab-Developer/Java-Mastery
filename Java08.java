import java.util.concurrent.CompletableFuture;

public class Java08 {
    public static void main(String[] args) {
        System.out.println("Doing Working");
        CompletableFuture<String> future = getUserDetails().thenCombine(getPosts("Aftab"),(s,w) -> s+w+" ");
        String join = future.join();
        System.out.println(join);

        System.out.println("process finished");
    }

    public static CompletableFuture<String> getUserDetails () {
        return CompletableFuture.supplyAsync(
                () -> {
                    delay(2000) ;
                    return "Mr Aftab Alam" ;
                }
        ).thenApply((s) ->  s + " " + " Developer") ;
    }
    public static CompletableFuture<String> getPosts (String userData) {
        return CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return userData + " Posts Fetched" ;
                }
        ).thenApply((s) ->  s + " " + " Fetched") ;
    }
    public static void delay(double sec) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

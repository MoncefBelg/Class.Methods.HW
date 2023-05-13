public class TestComputer {
    public static void main(String[] args) {
        Computer[] computer={new Computer("MacBook Air M11",16,"4k",2020),
        new Apple("MacBook Air M11",12,"8K",2022),
        new Lenovo("IdeaPad",8,"4K",2020),
        new HP("Ry-zen",16,"6K",2018),
        new Dell("Latitude",8,"4K",2017)};

        for(Computer Stock:computer){
        if( Stock instanceof Apple){
            ((Apple)Stock).ShutDown();
        }
        Stock.loading();
        Stock.download();

        }

    }
}

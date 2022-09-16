package myExercises.courseMoshEx.designPatterns.behavioal.template.goodWay;

public class Main {
    public static void main(String[] args) {
        TransferMoneyTask transferMoneyTask=new TransferMoneyTask();
        transferMoneyTask.execute(); /// record ile isleyen

//        transferMoneyTask.doExecute(); /// recordsuz isleyen
    }
}

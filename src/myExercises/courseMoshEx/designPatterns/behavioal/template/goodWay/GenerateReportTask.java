package myExercises.courseMoshEx.designPatterns.behavioal.template.goodWay;

public class GenerateReportTask extends Task{

//
//    public void execute() {
//        auditTrail.record();
//        System.out.println("Report task generated");
//    }

    @Override
    protected void doExecute() {
        System.out.println("Report task generated");
    }
}

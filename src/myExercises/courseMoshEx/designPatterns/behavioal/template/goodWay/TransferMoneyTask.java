package myExercises.courseMoshEx.designPatterns.behavioal.template.goodWay;

public class TransferMoneyTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Transfer made");
    }
//
//    AuditTrail auditTrail;

//    public TransferMoneyTask(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }

//    public void execute() {
//        auditTrail.record();
//        System.out.println("Transfer made");
//    }
}

package myExercises.courseMoshEx.designPatterns.behavioal.template.badWay;

public class TransferMoneyTask {

    AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Transfer made");
    }
}

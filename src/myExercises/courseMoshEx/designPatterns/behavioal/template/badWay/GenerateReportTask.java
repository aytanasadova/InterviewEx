package myExercises.courseMoshEx.designPatterns.behavioal.template.badWay;

public class GenerateReportTask {
    AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Report task generated");
    }
}

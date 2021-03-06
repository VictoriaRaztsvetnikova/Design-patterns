package OnlineFitness;

public class MainClass {

	public static void main(String[] args) {
		
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		Trainer trainer = new Trainer();
		Command getUpCommand = new GetUpCommand(trainer);
		Command lieDownCommand = new LieDownCommand(trainer);
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.GiveInstructions();
		
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.GiveInstructions();
		
		Observer obs1 = new Viewers("Viki");
		Observer obs2 = new Viewers("Kosi");
		Observer obs3 = new Viewers("Stefi");
		
		trainer.subscrite(obs1);
		trainer.subscrite(obs2);
		trainer.subscrite(obs3);
		
		
		
	}
}

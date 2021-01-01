package com.uvsoftgroup.bp.uvsoftgroupjavabp.controlstatement;

import java.util.List;

import com.uvsoftgroup.bp.uvsoftgroupjavabp.collectionsexm.UserRegistration;

public class ControlStatementExerciseMain {

	public static void main(String[] args) {
		List<UserRegistration> listResult=ControlStatementExercise.forLoopWithIfElseJava8("T");
		listResult.forEach(l->System.out.print(l.getUserRegistrationId()));
		
		String value =ControlStatementExercise.ifElseLadderStatement(1);
		// System.out.println(value);
		// System.out.println(switchCaseToReplaceIfElseLadder(4));
		// nestedSwitchStatement('M', 1);
		
		// ControlStatementExercise.forLoopBreakAndContinue();
		// ControlStatementExercise.whileLoopBreakAndContinue();
		// doWhileLoopBreakAndContinue();
		
	
	}
	
}

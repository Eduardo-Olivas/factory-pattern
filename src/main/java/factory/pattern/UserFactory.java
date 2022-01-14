package factory.pattern;

import factory.pattern.type.Developer;
import factory.pattern.type.ERS;
import factory.pattern.type.FunctionalAnalyst;
import factory.pattern.type.ProjectLeader;
import factory.pattern.type.QA;
import factory.pattern.user.User;

public class UserFactory {

	public static User getInstance(String type) {

		switch (type) {

		case "1":
			return new Developer();
		case "2":
			return new ERS();
		case "3":
			return new FunctionalAnalyst();
		case "4":
			return new ProjectLeader();
		case "5":
			return new QA();

		}
		return null;
	}
}

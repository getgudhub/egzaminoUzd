package controller;

import model.Patiekalas;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class FormValidator implements Validator {
	
	@Override public boolean supports(Class<?> paramClass) {
		return Patiekalas.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
		
		Patiekalas film = (Patiekalas) obj;
		if(film.getId()<=0){
			errors.rejectValue("id", "negativeValue", new Object[] {"'id'"}, "id negali buti neigiamas");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nuoKada", "date.required");
	}

}

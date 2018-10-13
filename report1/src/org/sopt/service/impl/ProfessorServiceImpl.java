package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
    @Override
    public Professor getByname(String name) {
        final ProfessorBuilder professorBuilder = new ProfessorBuilder();
        final Professor professor = professorBuilder.build();

        return professor;
    }
}

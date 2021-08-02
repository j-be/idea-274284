package org.duckdns.owly.test.idea_274284.processor;

import org.apache.velocity.app.Velocity;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("javax.persistence.Entity")
public class SampleProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Velocity.init();
        return false;
    }
}

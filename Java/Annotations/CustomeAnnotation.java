/*
 * 
 * Annotations can be created on the following : 
 * 
 * Annotation whiouth any variable is Marker interface
 * One value is Single value annotation
 * Two or more are Multi value annotation
 * 
 *      Class       :  ELEMENT.TYPE
 *      Methods     :  ELEMENT.METHOD
 *      Variables   :  ELELEMT.FIELD
 * 
 * 
 * 
*/

package Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

public class CustomeAnnotation {
    public static void main(String args[]){

        Class<TestAnnotationClass> classObject = TestAnnotationClass.class;
        var annotationOnClass = (Versions)classObject.getAnnotation(Versions.class);

        System.out.println(annotationOnClass.Version());
    
    }

}


@Versions
class TestAnnotationClass{
    public void Show(){
        System.out.println("Here");
    }
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Versions{
    Version Version() default Version.One;
}


enum Version{
    One, Two, Three
}

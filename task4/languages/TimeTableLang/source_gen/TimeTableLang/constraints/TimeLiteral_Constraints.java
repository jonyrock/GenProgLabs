package TimeTableLang.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class TimeLiteral_Constraints extends BaseConstraintsDescriptor {
  public TimeLiteral_Constraints() {
    super("TimeTableLang.structure.TimeLiteral");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("hours", new BasePropertyConstraintsDescriptor("hours", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "hours";
        return (SPropertyOperations.getInteger(propertyValue)) >= 0 && (SPropertyOperations.getInteger(propertyValue)) <= 23;
      }
    });
    properties.put("minutes", new BasePropertyConstraintsDescriptor("minutes", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "minutes";
        return (SPropertyOperations.getInteger(propertyValue)) >= 0 && (SPropertyOperations.getInteger(propertyValue)) <= 59;
      }
    });
    return properties;
  }
}

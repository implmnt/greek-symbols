package im.plmnt.plugin.greek

import com.intellij.codeInsight.template.{TemplateActionContext, TemplateContextType}

class GreekContext extends TemplateContextType("OTHER", "Greek") {
  override def isInContext(tac: TemplateActionContext): Boolean = true
}

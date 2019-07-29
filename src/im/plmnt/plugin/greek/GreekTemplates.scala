package im.plmnt.plugin.greek

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class GreekTemplates extends DefaultLiveTemplatesProvider {
  def getDefaultLiveTemplateFiles = Array("templates")
  def getHiddenLiveTemplateFiles = Array.empty
}

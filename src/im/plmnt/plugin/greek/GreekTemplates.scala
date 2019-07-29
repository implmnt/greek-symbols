package im.plmnt.plugin.greek

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class GreekTemplates extends DefaultLiveTemplatesProvider {

  def getDefaultLiveTemplateFiles: Array[String] = Array("templates")

  def getHiddenLiveTemplateFiles: Array[String] = Array.empty
}

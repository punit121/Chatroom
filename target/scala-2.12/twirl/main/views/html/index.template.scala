
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,org.webjars.play.WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, webJarsUtil: org.webjars.play.WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        """),_display_(/*9.10*/Html(webJarsUtil.css("bootstrap.min.css"))),format.raw/*9.52*/("""
        """),_display_(/*10.10*/Html(webJarsUtil.css("bootstrap-theme.min.css"))),format.raw/*10.58*/("""

        """),format.raw/*12.9*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css")),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">
        <title>Chat Room</title>

    </head>

    <body>
        <div class="wrap">
            <div class="container-fluid">
                <div>
                    <h1 class="">Chat Room</h1>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <ul id="messages" class="list-unstyled">
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="footer navbar-fixed-bottom">
            <div class="row">
                <div class="col-xs-8 col-sm-9">
                    <input id="message" placeholder="Type Here" type="text"
                      autofocus
                      autocomplete="off" spellcheck="false" autocorrect="off"
                      class="form-control input-lg" />
                </div>

                <div class="col-xs-4 col-sm-3">
                    <button id="send" type="submit" class="btn btn-primary btn-lg btn-block">Send</button>
                </div>
            </div>
        </div>

        """),_display_(/*49.10*/Html(webJarsUtil.script("jquery.min.js"))),format.raw/*49.51*/("""

        """),format.raw/*51.9*/("""<script language="javascript">
                var $messages = $("#messages"),
                        $send = $("#send"),
                        $message = $("#message"),
                        connection = new WebSocket(""""),_display_(/*55.54*/url),format.raw/*55.57*/("""");

                $send.prop("disabled", true);

                var send = function () """),format.raw/*59.40*/("""{"""),format.raw/*59.41*/("""
                    """),format.raw/*60.21*/("""var text = $message.val();
                    $message.val("");
                    connection.send(text);
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""";

                connection.onopen = function () """),format.raw/*65.49*/("""{"""),format.raw/*65.50*/("""
                    """),format.raw/*66.21*/("""$send.prop("disabled", false);
                    $messages.prepend($("<li class='bg-info' style='font-size: 1.5em'>Connected</li>"));
                    $send.on('click', send);
                    $message.keypress(function(event)"""),format.raw/*69.54*/("""{"""),format.raw/*69.55*/("""
                        """),format.raw/*70.25*/("""var keycode = (event.keyCode ? event.keyCode : event.which);
                        if(keycode == '13')"""),format.raw/*71.44*/("""{"""),format.raw/*71.45*/("""
                            """),format.raw/*72.29*/("""send();
                        """),format.raw/*73.25*/("""}"""),format.raw/*73.26*/("""
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/(""");
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/(""";
                connection.onerror = function (error) """),format.raw/*76.55*/("""{"""),format.raw/*76.56*/("""
                    """),format.raw/*77.21*/("""console.log('WebSocket Error ', error);
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/(""";
                connection.onmessage = function (event) """),format.raw/*79.57*/("""{"""),format.raw/*79.58*/("""
                    """),format.raw/*80.21*/("""$messages.append($("<li style='font-size: 1.5em'>" + event.data + "</li>"))
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""
        """),format.raw/*82.9*/("""</script>
    </body>

</html>"""))
      }
    }
  }

  def render(url:String,webJarsUtil:org.webjars.play.WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(url,webJarsUtil)

  def f:((String,org.webjars.play.WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (url,webJarsUtil) => apply(url,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 09 17:07:51 IST 2018
                  SOURCE: /Users/punit/Downloads/play-java-chatroom-example/app/views/index.scala.html
                  HASH: bcb433a378dcdfc6dabb0e6990b78dc898207efc
                  MATRIX: 977->1|1127->58|1377->282|1439->324|1476->334|1545->382|1582->392|1654->437|1669->443|1724->477|1812->538|1827->544|1880->576|3003->1672|3065->1713|3102->1723|3355->1949|3379->1952|3498->2043|3527->2044|3576->2065|3728->2189|3757->2190|3836->2241|3865->2242|3914->2263|4176->2497|4205->2498|4258->2523|4390->2627|4419->2628|4476->2657|4536->2689|4565->2690|4614->2711|4643->2712|4690->2731|4719->2732|4803->2788|4832->2789|4881->2810|4965->2866|4994->2867|5080->2925|5109->2926|5158->2947|5278->3039|5307->3040|5343->3049
                  LINES: 28->1|33->2|40->9|40->9|41->10|41->10|43->12|43->12|43->12|43->12|44->13|44->13|44->13|80->49|80->49|82->51|86->55|86->55|90->59|90->59|91->60|94->63|94->63|96->65|96->65|97->66|100->69|100->69|101->70|102->71|102->71|103->72|104->73|104->73|105->74|105->74|106->75|106->75|107->76|107->76|108->77|109->78|109->78|110->79|110->79|111->80|112->81|112->81|113->82
                  -- GENERATED --
              */
          
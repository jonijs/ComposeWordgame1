package com.example.composewordgame1
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

data class Title(val text: String) : Component()

data class Header(val text: String) : Component()

data class Image(val link: String, val caption: String?) : Component()

data class GifImage(val link: String, val caption: String?) : Component()

data class Paragraph(val text: String, val title: String? = null) : Component()

data class Newsletter(val rawHtml: String) : Component()

data class Article(
    val url: String,
    val components: List<Component>
)

fun getFrom(url : String): mutableListOf<Map<String, String>> {}
val table = mutableListOf<Map<String, String>>()

val doc: Document = Jsoup
    .connect("https://www.novelupdates.com/novelslisting/?sort=2&order=1&status=1&pg=$pg")
    .userAgent("Mozilla/5.0")
    .referrer("http://www.google.com")
    .ignoreContentType(true)
    .get()

val imageLists = doc.getElementsByClass("search_img_nu")
val lists = doc.getElementsByClass("search_main_box_nu")
   return table
}
package io.github.bersoncrios.rickpedia.models


import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.gson.annotations.SerializedName
import io.github.bersoncrios.rickpedia.R

@Entity(tableName = "char")
data class Char(

    @SerializedName("id")
    @PrimaryKey
    val id: Int,
    @SerializedName("created")
    val created: String,
//    @SerializedName("episode")
//    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
) {
    companion object {

        @JvmStatic
        @BindingAdapter("android:src")
        fun loadImage(view: ImageView, imageUrl: String) {
            Glide.with(view.context)
                .load(imageUrl)
                .apply(RequestOptions().error(R.drawable.no_image))
                .into(view)
        }
    }
}
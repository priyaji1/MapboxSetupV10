package com.info.mapboxtestapp.markers

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.info.mapboxtestapp.R
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapView
import com.mapbox.maps.Style
import com.mapbox.maps.extension.style.image.image
import com.mapbox.maps.extension.style.layers.generated.symbolLayer
import com.mapbox.maps.extension.style.layers.properties.generated.IconAnchor
import com.mapbox.maps.extension.style.sources.generated.geoJsonSource
import com.mapbox.maps.extension.style.style


/**
 * Add a blue teardrop-shaped marker image to a style and display it on the
 * map using a SymbolLayer.
 */
class AddOneMarkerSymbolActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mapView = MapView(this)
        setContentView(mapView)

        mapView.getMapboxMap().also {
            it.setCamera(
                CameraOptions.Builder()
                    .center(Point.fromLngLat(LONGITUDE, LATITUDE))
                    .zoom(8.0)
                    .build()
            )
        }.loadStyle(
            styleExtension = style(Style.MAPBOX_STREETS) {
// prepare blue marker from resources
                +image(BLUE_ICON_ID) {
                    bitmap(BitmapFactory.decodeResource(resources, R.drawable.ic_loc_choose))
                }
                +geoJsonSource(SOURCE_ID) {
                    geometry(Point.fromLngLat(LONGITUDE, LATITUDE))
                }
                +symbolLayer(LAYER_ID, SOURCE_ID) {
                    iconImage(BLUE_ICON_ID)
                    iconAnchor(IconAnchor.BOTTOM)
                }
            }
        )
    }

    companion object {
        private const val BLUE_ICON_ID = "blue"
        private const val SOURCE_ID = "source_id"
        private const val LAYER_ID = "layer_id"
        private const val LATITUDE = 55.665957
        private const val LONGITUDE = 12.550343
    }
}
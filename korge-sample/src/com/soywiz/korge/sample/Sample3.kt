package com.soywiz.korge.sample

import com.soywiz.korge.Korge
import com.soywiz.korge.animate.AnLibrary
import com.soywiz.korge.animate.play
import com.soywiz.korge.resources.Path
import com.soywiz.korge.scene.Module
import com.soywiz.korge.scene.Scene
import com.soywiz.korge.view.Container
import com.soywiz.korge.view.get
import java.util.*

object Sample3 : Module() {
	@JvmStatic fun main(args: Array<String>) = Korge(Sample3)

	override val mainScene: Class<out Scene> = MainScene::class.java

	class MainScene(
		@Path("semilla/semilla.swf") val semillaLibrary: AnLibrary
		//@Path("eyes.swf") val eyesLibrary: AnLibrary
		//@Path("eyes2.swf") val eyesLibrary: AnLibrary
		//@Path("radialgradient.swf") val library: AnLibrary
		//@Path("radialgradient2.swf") val library: AnLibrary
		//@Path("gradient1.swf") val library: AnLibrary
	) : Scene() {
		val random = Random()

		suspend override fun sceneInit(sceneView: Container) {
			//SwfLoader.load(views)

			sceneView += semillaLibrary.createMainTimeLine().apply { this["semilla"].play("anim2") }
			//sceneView += eyesLibrary.createMainTimeLine().apply { scale = 3.0 }
			//sceneView += library.createMainTimeLine().apply { scale = 3.0 }
		}
	}
}
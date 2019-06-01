package godot.samples.games.marmor

import godot.*
import godot.core.GD

class Main: Node() {
    override fun _ready() {
        GD.print("Marmor: Main: ready")
    }

    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}
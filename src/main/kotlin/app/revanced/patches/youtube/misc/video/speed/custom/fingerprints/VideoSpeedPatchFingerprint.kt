package app.revanced.patches.youtube.misc.video.speed.custom.fingerprints

import app.revanced.patcher.annotation.Name
import app.revanced.patcher.annotation.Version
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import app.revanced.patches.youtube.misc.video.speed.custom.annotations.CustomPlaybackSpeedCompatibility
import org.jf.dexlib2.Opcode

@Name("video-speed-patch-fingerprint")
@CustomPlaybackSpeedCompatibility
@Version("0.0.1")
object VideoSpeedPatchFingerprint : MethodFingerprint(
    opcodes = listOf(Opcode.FILL_ARRAY_DATA),
    customFingerprint = { methodDef ->
        methodDef.definingClass.endsWith("CustomVideoSpeedPatch;") && methodDef.name == "<clinit>"
    }
)

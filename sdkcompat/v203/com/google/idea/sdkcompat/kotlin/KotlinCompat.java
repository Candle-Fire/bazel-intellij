package com.google.idea.sdkcompat.kotlin;

import org.jetbrains.kotlin.cli.common.arguments.Freezable;

/** Provides SDK compatibility shims for Kotlin classes, available to IntelliJ CE & UE. */
public class KotlinCompat {
  private KotlinCompat() {}

  /** #api213 inline in BlazeKotlinSyncPlugin using FreezableKt.unfrozen() */
  public static Freezable unfreezeSettings(Freezable settings) {
    return settings.unfrozen();
  }
}

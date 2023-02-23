package io.github.terslenk.azap.utils;

import io.github.terslenk.azap.Azap;

public class Setup {
    public static void setup(Azap azap) {
    	Category.setup(azap);
        AddonItems.setup(azap);
    }
}

import { Platform } from "react-native";

if (Platform.OS !== "android") {
	throw new Error(
		"Currently supporting only Android, iOS will be implemented soon"
	);
}

export * from "./EButton.js";
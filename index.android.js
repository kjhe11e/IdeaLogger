'use strict';

import React from 'react';
import {
	AppRegistry,
	StyleSheet,
	Text,
	View
} from 'react-native';

class Welcome extends React.Component {
	render() {
		return (
			<View style={styles.container}>
				<Text style={styles.welcome}>Welcome</Text>
			</View>
		)
	}
}
var styles = StyleSheet.create({
	container: {
		flex: 1,
		justifyContent: 'center',
	},
	welcome: {
		fontSize: 20,
		textAlign: 'center',
		margin: 10,
	},
});

AppRegistry.registerComponent('Welcome', () => Welcome);

const clayDeps = require('liferay-npm-scripts/src/presets/standard/dependencies/clay');
const metalDeps = require('liferay-npm-scripts/src/presets/standard/dependencies/metal');

module.exports = {
	build: {
		dependencies: [
			...clayDeps,
			...metalDeps
		]
	},
	preset: 'liferay-npm-scripts/src/presets/standard'
};
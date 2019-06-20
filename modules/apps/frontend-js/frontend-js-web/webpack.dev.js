const config = require('./webpack.config');

module.exports = merge(
	...config,
	{
		devServer: {
			port: 3000,
			proxy: {
				'**': 'http://0.0.0.0:8080'
			},
			publicPath: common.publicPath
		},
		devtool: 'inline-source-map',
		mode: 'development'
	}
);
Liferay.Loader.require.apply(
	Liferay.Loader,
	$MODULES.concat(
		[
			function(Component) {
				var context = $CONTEXT;

				var destroyConfig = {
					destroyOnNavigate: true,
					portletId: context.portletId
				};

				var componentArgs = [context];

				if ($WRAPPER) {
					componentArgs.push('#$ID');
				}

				if (context.defaultEventHandler) {
					Liferay.componentReady(
						context.defaultEventHandler
					).then(
						function(defaultEventHandler) {
							context.defaultEventHandler = defaultEventHandler;

							Liferay.component(
								'$ID',
								new Component.default(...componentArgs),
								destroyConfig
							);
						}
					);
				}
				else {
					Liferay.component(
						'$ID',
						new Component.default(...componentArgs),
						destroyConfig
					);
				}
			},
			function(error) {
				console.error('Unable to load ' + $MODULES);

				Liferay.fire(
					'soyComponentLoadingError',
					{
						error: error,
						modules: $MODULES
					}
				);
			}
		]
	)
);
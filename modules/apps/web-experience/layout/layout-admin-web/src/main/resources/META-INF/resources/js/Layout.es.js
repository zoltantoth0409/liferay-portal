import Component from 'metal-component';
import {Config} from 'metal-state';
import Soy from 'metal-soy';
import 'metal-dropdown';

import './LayoutBreadcrumbs.es';
import './LayoutColumn.es';
import templates from './Layout.soy';

/**
 * Component that allows to show layouts tree in form of three dependent blocks.
 * It integrates three <LayoutBlock /> components for N-th, N-th + 2 and
 * N-th + 3 levels of layouts tree.
 */
class Layout extends Component {
	/**
	 * @inheritDoc
	 */
	attached() {
		const A = new AUI();

		A.use(
			'liferay-search-container',
			'liferay-search-container-select',
			A => {
				const plugins = [];

				plugins.push({
					cfg: {
						rowSelector: '.page-list-block',
					},
					fn: A.Plugin.SearchContainerSelect,
				});

				const searchContainer = new Liferay.SearchContainer({
					contentBox: A.one(this.refs.layout),
					id:
						this.getInitialConfig().portletNamespace +
						this.getInitialConfig().searchContainerId,
					plugins: plugins,
				});

				this.searchContainer_ = searchContainer;

				Liferay.fire('search-container:registered', {
					searchContainer: searchContainer,
				});
			}
		);
	}

	/**
	 * @inheritDoc
	 */
	rendered() {
		this.refs.layout.scrollLeft = this.refs.layout.scrollWidth;
	}
}

/**
 * State definition.
 * @type {!Object}
 * @static
 */
Layout.STATE = {
	/**
	 * Breadcrumb Entries
	 * @instance
	 * @memberof Layout
	 * @type {!Array}
	 */
	breadcrumbEntries: Config.arrayOf(
		Config.shapeOf({
			title: Config.string().required(),
			url: Config.string().required(),
		})
	).required(),

	/**
	 * Layout blocks
	 * @instance
	 * @memberof Layout
	 * @type {!Array}
	 */
	layoutBlocks: Config.arrayOf(
		Config.arrayOf(
			Config.shapeOf({
				active: Config.bool().required(),
				hasChild: Config.bool().required(),
				icon: Config.string().required(),
				layoutId: Config.string().required(),
				parentLayoutId: Config.string().required(),
				selected: Config.bool().required(),
				title: Config.string().required(),
			})
		)
	).required(),

	/**
	 * URL for using icons
	 * @instance
	 * @memberof Layout
	 * @type {!string}
	 */
	pathThemeImages: Config.string().required(),

	/**
	 * Namespace of portlet to prefix parameters names
	 * @instance
	 * @memberof Layout
	 * @type {!string}
	 */
	portletNamespace: Config.string().required(),

	/**
	 * URL of portlet to prefix block links
	 * @instance
	 * @memberof Layout
	 * @type {!string}
	 */
	portletURL: Config.string().required(),
};

Soy.register(Layout, templates);

export {Layout};
export default Layout;

allow.unmatched=false
osgi.jaxrs.application.select="(osgi.jaxrs.name=${configYAML.application.name})"
osgi.jaxrs.name="${configYAML.application.name}.OAuth2.Scope.Checker"
patterns=["GET::/workflow-logs/[\d]+::everything.read"]
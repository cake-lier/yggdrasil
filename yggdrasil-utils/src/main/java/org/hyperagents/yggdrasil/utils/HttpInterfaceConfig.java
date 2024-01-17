package org.hyperagents.yggdrasil.utils;

import java.util.Optional;

public interface HttpInterfaceConfig {
  String getHost();

  int getPort();

  String getBaseUri();

  Optional<String> getWebSubHubUri();

  String getWorkspacesUri();

  String getWorkspaceUri(String workspaceName);

  String getArtifactsUri(String workspaceName);

  String getArtifactUri(String workspaceName, String artifactName);

  String getAgentBodiesUri(String workspaceName);

  String getAgentBodyUri(String workspaceName, String agentName);

  String getAgentUri(String agentName);
}

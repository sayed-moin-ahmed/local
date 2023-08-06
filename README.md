# local

Install docker-desktop, skaffold.

To run skaffold we need either Dockerfile(locally)/jib/buildpack

Initiate Skaffold:
DOCKER_HOST=unix:///home/sayed/.docker/desktop/docker.sock skaffold init



Run Skaffold with dev below command:
DOCKER_HOST=unix:///home/sayed/.docker/desktop/docker.sock skaffold dev



Get pods in kubernates:
kubectl get pods -w

# local

Install docker-desktop, skaffold to run projects.

Run local,consumer & producer project to test complete flow.

local project includes kafka,redis, mysql setup.

All kubernates configuration file in k8s folder.

To run skaffold we need either Dockerfile(locally)/jib/buildpack

Initiate Skaffold:
DOCKER_HOST=unix:///home/sayed/.docker/desktop/docker.sock skaffold init

Run Skaffold with dev below command:
DOCKER_HOST=unix:///home/sayed/.docker/desktop/docker.sock skaffold dev

Kubernates command:
https://kubectl.docs.kubernetes.io/

Kubernates Dashboard:
https://github.com/kubernetes/dashboard/blob/master/docs/user/access-control/creating-sample-user.md

Cloud Code:
https://cloud.google.com/code/

## Git

Git is a version control system that is used to track changes to files and coordinate work on those files among multiple people. Git is commonly used for source code management in software development, but it can be used to track changes to any set of files.

Some of the main benefits of using Git include:
- Team Collaboration.
- Track Changes.
- Revert Changes.

### Questions Related to Git:

**1. Can you explain the difference between Git and GitHub?**

Git is a version control system that is used to track changes to files and coordinate work on those files among multiple people. GitHub is a web-based hosting service for Git repositories. It provides a platform for developers to share and collaborate on Git repositories.

**2. How does Git handle conflicts when merging branches?**

When merging branches in Git, conflicts may occur if the same lines of a file have been changed in both branches. In this case, Git will not be able to automatically merge the branches and will mark the conflicting lines in the file. The user will then need to resolve the conflict by deciding which changes to keep or by manually merging the changes.

**What is git rebase?**

git rebase is a Git command that allows us to apply a series of commits from one branch onto another branch. It works by replaying the commits from the source branch on top of the destination branch, as if the commits were new.

For example, let's say we have the following commit history:

```
A---B---C topic
   \
    D---E---F master
```

Here, **topic** is a branch that was created off of master. If you wanted to apply the changes from topic onto master, you could use `git rebase master`. This would result in the following commit history:

```
A---B---C topic
         \
          D'--E'--F' master
```

One advantage of using git rebase is that it can make your commit history look cleaner and more linear, since it avoids creating multiple merge commits. However, rebasing can be more complex and can cause conflicts if the same lines of a file have been modified in both branches. It is generally recommended to only use rebase when working on your own branches, and to use git merge when integrating changes from other people's branches.

Some use cases of **git rebase** are:

**1. Updating a feature branch with the latest changes from the main branch:** Suppose you are working on a feature branch that was created off of the master branch. While you are working on the feature, other people might have made additional commits to the master branch. If you want to update your feature branch with the latest changes from master, you can use `git rebase master` to apply the new commits from master onto your feature branch.

**2. Cleaning up a messy commit history:** If you have made a lot of commits to a branch that are not yet ready to be merged, you can use git rebase -i to interactively edit your commit history. This allows you to squash multiple commits into a single commit, reorder commits, or discard commits entirely. This can be useful if you want to make your commit history more organized and easier to understand.
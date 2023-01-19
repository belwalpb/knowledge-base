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


**What is git merge?**

git merge is a Git command that allows us to combine the changes from two branches. When we perform a merge, Git creates a new commit that brings the changes from one branch into another branch.

**When to use git merge and when to use git rebase?**

Use git merge when...
- We want to preserve the entire commit history of the merged branch.
- We are merging changes from multiple people and want to keep track of who made which changes.
- We are merging changes that have already been reviewed and tested.

Use git rebase when...
- We want to keep the commit history of the current branch clean and linear.
- We are the only one working on the branch and want to incorporate the latest changes from the main branch.
- We have made a lot of commits on our branch and want to squash them into a smaller number of commits before merging.


**What is git fetch command?**

When we run `git fetch`, it retrieves new work from the remote repository and stores it in a remote branch in our local repository, but it does not automatically merge it into our local branches. The remote branch is named origin/branch-name, where origin is the name of the remote repository, and branch-name is the name of the branch on the remote repository.

To merge the new work from the remote branch into your local branch, we can use the `git merge` command. For example, to merge the new work from origin/branch-name into our local branch-name branch, we would run `git merge origin/branch-name`. This will incorporate the new work into our local branch, and we will be able to see the changes in our local repository branches.

**What is git pull command?**

git pull is a convenience command that combines the functionality of `git fetch` and `git merge`. It retrieves new work from a remote repository and merges it into our current branch.

Here's how it works:
- git pull fetches new work from the specified remote repository (just like git fetch).
- It determines which branch in the local repository is set up to track the specified remote branch (using the git branch -u command).
- It merges the new work from the remote branch into the local branch that is set up to track it (using git merge).


**How git rebase command will behave If the source and destination branches have some common previous commits, and each branch has additional commits that are not present in the other branch**

In this case, `git rebase` will apply the commits from the source branch on top of the commits in the destination branch.

For example, let's say we have the following commit history:

```
A---B---C---D  branch-1
         \
          E---F---G  branch-2
```

Here, A, B, and C are common commits that are present in both branch-1 and branch-2. D is a commit that is only present in branch-1, and E, F, and G are commits that are only present in branch-2.

If we run `git rebase branch-1 branch-2`, it will apply the commits E, F, and G on top of branch-1, resulting in the following commit history:

```
A---B---C---D---E'---F'---G'  branch-2
```

The E', F', and G' commits are the result of applying the changes from E, F, and G on top of branch-1. Note that the original commits E, F, and G are no longer present in the history, and have been replaced by the new commits E', F', and G'.


### Important Questions Asked about Git:

**How do you create a new repository in Git?**

To create a new repository in Git, we can use the `git init` command. This will create a new repository in the current directory and initialize it with a default .git subdirectory where the repository's history will be stored. We can then start adding and committing files to the repository.

**How do you clone an existing repository in Git?**

To clone an existing repository in Git, we can use the `git clone` command, followed by the URL of the repository that you want to clone.

**How do you create a new branch in Git?**

To create a new branch in Git, we can use the `git branch` command, followed by the name of the new branch. This will create a new branch with the specified name, based on the current commit in the repository. We can then switch to the new branch using the `git checkout` command.

OR

`git checkout -b branch-name` can also be used to checkout to a new branch by creating it.



**What is a conflict in Git, and how do you resolve it?**

A conflict in Git occurs when the same lines of code have been modified in two different branches, and Git is unable to automatically determine which changes should be kept. When this happens, Git will mark the conflicting lines in the files, and we will need to resolve the conflict manually by deciding which changes to keep and which to discard.

To resolve a conflict in Git, we will need to edit the conflicting files in your working directory and remove the conflict markers. We can then use the `git add` command to mark the conflicts as resolved, and use the `git commit` command to create a new commit that includes our resolved changes. This will complete the merge and update the current branch to point to the new commit.

Example:

```
$ git merge branch-1
Auto-merging file.txt
CONFLICT (content): Merge conflict in file.txt
Automatic merge failed; fix conflicts and then commit the result.

$ vi file.txt

<<<<<<< HEAD
This is the current version of the file.
=======
This is the version of the file from branch-1.
>>>>>>> branch-1

$ git add file.txt
$ git commit -m "Resolve conflicts"
```

**What is a remote in Git, and how do you add a remote to a repository?**

A remote in Git is a named reference to a repository on another machine. Remotes are used to share work between repositories and to allow us to work on a repository that is not stored on our local machine. To add a remote to a repository, we can use the `git remote add` command, followed by the name that we want to use for the remote and the URL of the repository that you want to add. For example: `git remote add origin https://github.com/user/repo.git`. This will add a remote named origin to our repository, and we will be able to use the name origin to refer to the remote repository in future commands.


### Some Additional Git Commands:

**1. git stash:** This command is used to temporarily save changes that we have made to our working directory, without committing them to the repository. We can then switch to a different branch, perform some other tasks, and later restore the saved changes. This can be useful when we want to switch branches without committing our changes, or when we want to save our work in progress while we work on something else.

To restore stashed changes, we can use the `git stash apply` command. This will apply the changes that were saved in the most recent stash, and restore them to our working directory.

**2. git cherry-pick:** This command is used to apply the changes from a specific commit to the current branch. We can use it to selectively apply changes from one branch to another, or to apply changes that were made in a different repository.

To use the git cherry-pick command, we will need to specify the commit or commits that we want to apply. We can do this by specifying the commit hash, or by using a range of commits. Here is the basic syntax for git cherry-pick:

```
git cherry-pick <commit>
```

Finally, we can use the -e option to edit the commit message of the cherry-picked commit(s):

```
git cherry-pick -e <commit>
```

This will open the commit message in your default text editor, allowing you to modify the message before the changes are applied.


**3. git reset:** This command is used to undo commits, move the current branch pointer, or discard changes in the working directory. It has several options that allow us to choose how we want to undo our changes, and can be a powerful tool for manipulating the commit history of our repository.

**4. git blame:** This command is used to show who last modified each line of a file, and when the modification was made. It can be useful for debugging problems or tracking down the history of a file.
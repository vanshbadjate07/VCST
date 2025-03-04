# **VCST Practical**

## **Team Members**

1. **Vansh Badjate** (Created repository, added addition feature, worked on README file)
2. **Gopal Dhok** (Added subtraction feature, worked on script.js)
3. **Aditya Hon** (Added multiplication feature, worked on index.html)
4. **Vaishnavi Nikumbh** (Added division feature, first to push, worked on style.css)

## **Project Workflow**

### **1. Repository Setup**

- Vansh created a GitHub repository and added all team members as collaborators.
- Everyone cloned the repository using:
  ```sh
  git clone <repo_link>
  ```
- Changed directory into the repository:
  ```sh
  cd <repo_name>
  ```

### **2. Individual Work on Separate Branches**

- Each member created their own branch and switched to it:
  ```sh
  git checkout -b <branch_name>
  ```
- Everyone wrote their own Java code for their respective features.
- They committed and pushed their changes to their respective branches:
  ```sh
  git add .
  git commit -m "Added <feature_name> feature"
  git push origin <branch_name>
  ```

### **3. Merging into the Main Branch**

- Everyone pulled the latest changes from the main branch:
  ```sh
  git pull origin main
  ```
- All members worked on a single `Hello.java` file and added their respective features.
- Vaishnavi was the first to push to `main`.
- Other members tried to push but encountered a **merge conflict**.

### **4. Resolving Merge Conflicts**

- Since multiple members modified the same file, conflicts occurred.
- One by one, each member pulled the latest changes:
  ```sh
  git pull origin main
  ```
- Conflict markers were manually resolved by ensuring all features were included.
- After resolving conflicts, each member committed and pushed:
  ```sh
  git add Hello.java
  git commit -m "Resolved merge conflict and added all features"
  git push origin main
  ```

### **5. Website Creation**

- The team decided to create a simple website.
- Work was distributed among members:
  - **Aditya**: Worked on `index.html`
  - **Gopal**: Worked on `script.js`
  - **Vaishnavi**: Worked on `style.css`
  - **Vansh**: Worked on `README.md`
- Each member pushed their respective files in their own branches.
- After reviewing, all files were merged into the `main` branch.

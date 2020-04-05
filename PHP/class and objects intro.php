<!DOCTYPE html>
<?php
    class employee
    {
        private $name;
        private $age;
        private $gender;
        private $salary;
        private $position;
        public function set($name, $age, $gender, $salary, $position)
        {
            $this->name=$name;
            $this->age=$age;
            $this->gender=$gender;
            $this->salary=$salary;
            $this->position=$position;
        }
        public function put()
        {
            echo "name = $this->name <br>age = $this->age <br>gender = $this->gender <br>salary =$this->salary<br>position =$this->position";
        }
    }

    if ($_SERVER['REQUEST_METHOD']=='POST') {
        if (!empty($_POST['name']) && !empty($_POST['age']) && !empty($_POST['gender']) && !empty($_POST['salary']) && !empty($_POST['position'])) {
            $staff=new employee();
            $staff->set($_POST['name'], $_POST['age'], $_POST['gender'], $_POST['salary'], $_POST['position']);
        }
    }

?>
<html>
    <head>
        <meta charset="utf-8">
        <title></title>
    </head>
    <body>
        <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF'])?>" method="post">
            <label>name</label>
            <input type="text" name="name">
            <br>
            <label>age</label>
            <input type="number" name="age">
            <br>
            <label>gender</label>
            <input type="text" name="gender">
            <br>
            <label>salary</label>
            <input type="number" name="salary">
            <br>
            <label>position</label>
            <input type="text" name="position">
            <br>
            <input type="submit" name="submit" value="submit">
            <?php
            if ($_SERVER['REQUEST_METHOD']=='POST') {
                echo "<hr>";
                if (isset($staff)) {
                    $staff->put();
                } else {
                    echo "all field are required (*)";
                }
            }
             ?>
        </form>
    </body>
</html>

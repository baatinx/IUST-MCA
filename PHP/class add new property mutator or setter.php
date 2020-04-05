<!DOCTYPE html>
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
            <label>salary</label>
            <input type="number" name="salary">
            <br>
            <label>position</label>
            <input type="text" name="position">
            <br>
            <input type="checkbox" name="new_property" value="gender"><label>add property <b>[ gender = male ]</b></label>
            <br>
            <input type="submit" name="submit" value="submit">
        </form>

        <?php
            if ($_SERVER['REQUEST_METHOD']=='POST') {
                // class decclaration;
                class employee
                {
                    private $name;
                    private $salary;
                    private $position;
                    public function set($name, $salary, $position)
                    {
                        $this->name=$name;
                        $this->salary=$salary;
                        $this->position=$position;
                        //    $this->news='lakjdflkjfdk';
                    }

                    public function __set($property_name, $property_value)
                    {
                        $this->$property_name=$property_value;
                    }
                    public function put()
                    {
                        echo "name = $this->name <br>salary =$this->salary<br>position =$this->position";
                        // if new property exists, then echo it
                        // property_exists(objectname,property);
                        $p=''; // p is global to this function;
                        if (isset($_POST['new_property'])) {
                            $p=$_POST['new_property'];
                        }

                        if (property_exists($this, $p)) {
                            echo "<br><b>new property added</b><br>";
                            echo $p.' = '.$this->$p;
                        } else {
                            echo "<br><b>no new property added</b>";
                        }
                    }
                }

                //end of class declaration

                if (!empty($_POST['name']) && !empty($_POST['salary']) && !empty($_POST['position'])) {
                    $staff=new employee();
                    $staff->set($_POST['name'], $_POST['salary'], $_POST['position']);
                    //if check box is checked, then add new property;
                    if (isset($_POST['new_property'])) {
                        $p=$_POST['new_property'];
                        $staff->$p='male';
                    }
                    // end of check box
                    echo "<hr>";
                    if (isset($staff)) {
                        $staff->put();
                    }
                } else {
                    echo "all field are required (*)";
                }
            }

         ?>
    </body>
</html>

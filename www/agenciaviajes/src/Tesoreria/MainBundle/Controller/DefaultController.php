<?php

namespace Tesoreria\MainBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class DefaultController extends Controller
{
    public function indexAction($name)
    {
        return $this->render('TesoreriaMainBundle:Default:index.html.twig', array('name' => $name));
    }
}

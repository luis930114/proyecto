<?php

namespace Area\MainBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class DefaultController extends Controller
{
    public function indexAction($name)
    {
        return $this->render('AreaMainBundle:Default:index.html.twig', array('name' => $name));
    }
}

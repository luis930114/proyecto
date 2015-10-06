<?php

namespace Agencia\MainBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * Pagos
 *
 * @ORM\Table()
 * @ORM\Entity
 */
class Pagos
{
    /**
     * @var integer
     *
     * @ORM\Column(name="id", type="integer")
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    private $id;

    /**
     * @var integer
     *
     * @ORM\Column(name="valor", type="integer")
     */
    private $valor;

    /**
     * @var boolean
     *
     * @ORM\Column(name="solicitudAprobada", type="boolean")
     */
    private $solicitudAprobada;


    /**
     * Get id
     *
     * @return integer
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set valor
     *
     * @param integer $valor
     *
     * @return Pagos
     */
    public function setValor($valor)
    {
        $this->valor = $valor;

        return $this;
    }

    /**
     * Get valor
     *
     * @return integer
     */
    public function getValor()
    {
        return $this->valor;
    }

    /**
     * Set solicitudAprobada
     *
     * @param boolean $solicitudAprobada
     *
     * @return Pagos
     */
    public function setSolicitudAprobada($solicitudAprobada)
    {
        $this->solicitudAprobada = $solicitudAprobada;

        return $this;
    }

    /**
     * Get solicitudAprobada
     *
     * @return boolean
     */
    public function getSolicitudAprobada()
    {
        return $this->solicitudAprobada;
    }
}

